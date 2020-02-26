package org.mybatis.repls.controller;

import org.mybatis.repls.dto.Repls;
import org.mybatis.repls.service.ReplsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/repls")
public class ReplsController {

    @Resource
    private ReplsService rs;

    @RequestMapping(value = "/reply/{shopNum}", method = RequestMethod.GET)
    public ModelAndView list(Repls r, @PathVariable String shopNum) throws Exception {
        r.setShopNum(shopNum);
        List<Repls> repls = this.rs.list_repls(r);
        ModelAndView mv = new ModelAndView(("/repls/reply"));
        mv.addObject("repls", repls);
        mv.addObject("shopNum", shopNum);
        return mv;
    }

    @RequestMapping(value = "/reply/{shopNum}", method = RequestMethod.POST)
    public ModelAndView insert (Repls r, @PathVariable String shopNum) throws Exception {
        RedirectView rv = new RedirectView("/naris/view/{shopNum}");
        rv.setExposeModelAttributes(false);

//        HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
//        String ip = req.getHeader("X-FORWARDED-FOR");
//        if (ip == null)
//            ip = req.getRemoteAddr();
//        r.setIp(ip);

        this.rs.insert_repls(r);
        return  new ModelAndView(rv);
    }
    @RequestMapping(value = "/rmodify/{idx}", method = RequestMethod.GET)
    public ModelAndView modifyForm (@PathVariable String idx) throws Exception {
        ModelAndView mv = new ModelAndView("/repls/rmodify");
        Repls r = this.rs.select_repls(idx);
        mv.addObject("r", r);
        return mv;
    }
    @RequestMapping(value = "/rmodify", method = RequestMethod.POST)
    public ModelAndView modify (Repls r) throws Exception {
        RedirectView rv = new RedirectView("list");
        rv.setExposeModelAttributes(false);
        this.rs.modify_repls(r);
        return new ModelAndView(rv);
    }
    @RequestMapping(value = "/rdelete/{idx}", method = RequestMethod.GET)
    public ModelAndView delete (@PathVariable String idx) throws Exception {
        RedirectView rv = new RedirectView("list");
        rv.setExposeModelAttributes(false);
        this.rs.delete_repls(idx);
        return new ModelAndView(rv);
    }

}