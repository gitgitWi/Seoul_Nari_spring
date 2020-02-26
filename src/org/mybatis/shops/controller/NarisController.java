package org.mybatis.shops.controller;

import org.mybatis.shops.dto.Naris;
import org.mybatis.shops.service.NarisService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/naris")
public class NarisController {

    @Resource
    private NarisService ns;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list(Naris n) throws Exception {
        if(n.getSearchText() == null) n.setSearchText("");
//        if(n.getSearchType() == null) n.setSearchType("ALL");

        List<Naris> list = this.ns.list_naris(n);
        ModelAndView mv = new ModelAndView("/naris/list");
        mv.addObject("list", list);
        mv.addObject("searchText", n.getSearchText());
        mv.addObject("searchType", n.getSearchType());

        return mv;
    }

    @RequestMapping(value = "/write", method = RequestMethod.GET)
    public String writeForm() throws Exception {
        return "/naris/write";
    }

    @RequestMapping(value = "/write", method = RequestMethod.POST)
    public ModelAndView write(Naris naris) throws Exception {
        RedirectView rv = new RedirectView("list");
        rv.setExposeModelAttributes(false);
        this.ns.insert_naris(naris);
        return new ModelAndView(rv);
    }

    @RequestMapping(value = "/view/{idx}", method = RequestMethod.GET)
    public ModelAndView view(@PathVariable String idx) throws Exception {
        ModelAndView mv = new ModelAndView("/naris/view");
        Naris m = this.ns.select_naris(idx);
        mv.addObject("m", m);
        this.ns.hitUps(idx);
        return mv;
    }

    @RequestMapping(value = "/modify/{idx}", method = RequestMethod.GET)
    public ModelAndView modifyForm(@PathVariable String idx) throws Exception {
        ModelAndView mv = new ModelAndView("/naris/modify");
        Naris m = this.ns.select_naris(idx);
        mv.addObject("m", m);
        return mv;
    }

    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public ModelAndView modify(Naris m) throws Exception {
        RedirectView rv = new RedirectView("list");
        rv.setExposeModelAttributes(false);

        this.ns.modify_naris(m);
        return new ModelAndView(rv);
    }

    @RequestMapping(value = "/delete/{idx}", method = RequestMethod.GET)
    public ModelAndView delchck(@PathVariable String idx) throws Exception {
        ModelAndView mv = new ModelAndView("/naris/delchk");
;       Naris m = this.ns.select_naris(idx);
        mv.addObject("m", m);
        return mv;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ModelAndView delete (Naris m) throws Exception {
        RedirectView rv = new RedirectView("/naris/list");
        rv.setExposeModelAttributes(false);
        this.ns.delete_naris(m.getIdx());
        return new ModelAndView(rv);
    }

}
