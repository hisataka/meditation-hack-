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
import com.repository.SystemValueRepository;
import com.entity.SystemValue;

@Controller
//@SessionAttributes("scopedTarget.auth")
public class TwitterController {
  @Autowired
  TwitterLogic twitterLogic;

  @Autowired
  SystemValueRepository systemValueRepository;

  @ModelAttribute
  TwitterForm setUpForm() {
    TwitterForm form = new TwitterForm();
    return form;
  }

  @RequestMapping("/")
  String index(@ModelAttribute TwitterForm form, Model model) {
    form.setTest("test message");
    model.addAttribute("form", form);
    return "twitter/favbom";
  }

  @RequestMapping(value="/service")
	@ResponseBody
	public String singlefav(@ModelAttribute TwitterForm form, Model model) {
		return form.getTest();
	}
}