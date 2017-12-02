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

import javax.persistence.EntityManager;
import java.math.BigInteger;
import java.text.SimpleDateFormat;

import java.util.Date;


@Controller
public class TwitterController {
  @Autowired
  TwitterLogic twitterLogic;

  @Autowired
  MediRepository mediRepository;

  @Autowired
  EntityManager entityManager;

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
	public String updateTime(@ModelAttribute TwitterForm form, Model model) {
    try {
    Medi medi = new Medi();
    medi.setUsername(form.getUsername());
    if (form.getTimecount() != null && form.getTimecount() != "") {
      int timecount = Integer.parseInt(form.getTimecount());
      medi.setTimecount(timecount);
      medi.setPoint(timecount);
    }
    if (form.getPoslatf() != null && form.getPoslatf() != "") {
      double poslatf = Double.parseDouble(form.getPoslatf());
      medi.setPoslatf(poslatf);
    }


    if (form.getPoslonf() != null && form.getPoslonf() != "") {
      double poslonf = Double.parseDouble(form.getPoslonf());
      medi.setPoslonf(poslonf);
    }


    if (form.getPoslatt() != null && form.getPoslatt() != "") {
      double poslatt = Double.parseDouble(form.getPoslatt());
      medi.setPoslatt(poslatt);
    }



    if (form.getPoslont() != null && form.getPoslont() != "") {
      double poslont = Double.parseDouble(form.getPoslont());
      medi.setPoslont(poslont);
    }


    if (form.getTimef() != null && form.getTimef() != "") {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:dd");
        Date timef = sdf.parse(form.getTimef());
        medi.setTimef(timef);
    }

    if (form.getTimet() != null && form.getTimet() != "") {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:dd");
        Date timet = sdf.parse(form.getTimet());
        medi.setTimet(timet);
    }


      BigInteger results = (BigInteger)entityManager.createNativeQuery("select nextval('medi_seq')").getSingleResult();

    medi.setSeq(results);

    mediRepository.save(medi);

//     List<Medi> list = mediRepository.findAll();
     
//    return list.get(0).getUsername();

//     Gson g = new Gson();
//     return g.toJson(list);
      return "true";
    } catch(Exception e) {
      return "false";
    }
	}



  @RequestMapping(value="/getRankingList")
	@ResponseBody
	public String getRankingList(@ModelAttribute TwitterForm form, Model model) {
//    try {
      int counts = Integer.parseInt(form.getCounts());

      String sql = "select rank, username, point from (select row_number() over(order by point desc) rank, username, point from (select username, max(point) as point from medi group by username) A order by point desc) A where rank <= ";
      sql += counts;

      List<String> results = entityManager.createNamedQuery(sql, String.class).getResultList();


     Gson g = new Gson();
     return g.toJson(results);
 //   } catch(Exception e) {
   //   return "false";
    //}
	}
}