package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.form.TwitterForm;
import com.logic.TwitterLogic;
import com.repository.MediRepository;
import com.entity.Medi;
import com.google.gson.Gson;

@Controller
//@SessionAttributes("scopedTarget.auth")
public class TwitterController {
  @Autowired
  TwitterLogic twitterLogic;

  @Autowired
  MediRepository mediRepository;

  @ModelAttribute
  TwitterForm setUpForm() {
    TwitterForm form = new TwitterForm();
    return form;
  }

  @RequestMapping("/")
  String index(@ModelAttribute TwitterForm form, Model model) {
    model.addAttribute("form", form);
    return "twitter/favbom";
  }

  @RequestMapping(value="/updateTime")
	@ResponseBody
	public String singlefav(@ModelAttribute TwitterForm form, Model model) {
    Medi medi = new Medi();
    medi.setUsername(form.getUsername());
    if (form.getTimecount() != "") {
      int timecount = Integer.parseInt(form.getTimecount());
      medi.setTimecount(timecount);
    }
    if (form.getPoslatf() != "") {
      double poslatf = Double.parseDouble(form.getPoslatf());
      medi.setPoslatf(poslatf);
    }

    mediRepository.save(medi);

     List<Medi> list = mediRepository.findAll();
     
//    return list.get(0).getUsername();

     Gson g = new Gson();
     return g.toJson(list);
	}
}