package ujaen.tennis.tennisspringmvc.controller;

import ujaen.tennis.tennisspringmvc.model.dao.SociosDAO;
import ujaen.tennis.tennisspringmvc.model.Socio;
import java.util.List;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/tennis")
public class TennisController {

    @Autowired
    @Qualifier("sociosDAOJPA")
    private SociosDAO sociosDAO;

    public TennisController() {
    }


    @ModelAttribute
    private void configView(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
        //Common variables for Views
        model.addAttribute("srvUrl", request.getContextPath()+request.getServletPath()+"/tennis");
        model.addAttribute("imgUrl", request.getContextPath()+"/images");
    }

    @GetMapping(path = {"","/crudSocios"})
    public String listado(ModelMap model) {
        List<Socio> socios=sociosDAO.buscaTodos();
        model.addAttribute("socios", socios);
        return "/tennis/crudSocios";
    }

    @GetMapping("/visualiza")
    public String visualiza(@RequestParam(value="id",defaultValue="0")Integer id, ModelMap model ) {
        model.addAttribute("socio",sociosDAO.buscaId(id));
        return "tennis/visualiza";
    }

    @GetMapping("/visualiza/{id}")
    public String visualizaId(@PathVariable Integer id, ModelMap model ) {
        model.addAttribute("socio",sociosDAO.buscaId(id));
        return "tennis/visualiza";
    }

    @GetMapping("/borra")
    public String borra(@RequestParam(value="id",defaultValue="0")Integer id, ModelMap model) {
        sociosDAO.borra(id);
        model.clear();
        return "redirect:/tennis";
    }

    @GetMapping("/crea")
    public String creaForm(ModelMap model) {
        model.addAttribute("socio",new Socio());
        return "tennis/crea";
    }

    @PostMapping("/crea")
    public String crea( @ModelAttribute("socio") @Valid Socio socio, BindingResult result, ModelMap model) {
        String view="redirect:/tennis"; //default view

        if (!result.hasErrors()) {
            sociosDAO.crea(socio);
            model.clear();
        }else {
            view="tennis/crea";
        }
        return view;
    }

    @GetMapping("/edita")
    public String editaForm(@RequestParam(value="id",defaultValue="0")Integer id, ModelMap model ) {
        model.addAttribute("socio", sociosDAO.buscaId(id));
        return "tennis/edita";
    }

    @PostMapping("/edita")
    public String edita(@ModelAttribute("socio") @Valid Socio socio, BindingResult result, ModelMap model) {
        String view="redirect:/tennis";
        if (!result.hasErrors()) {
            sociosDAO.guarda(socio);
            model.clear();
        } else {
            view="tennis/edita";
        }
        return view;
    }

}
