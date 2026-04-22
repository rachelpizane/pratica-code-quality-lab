package edu.rachelpizane.formatacao.controller;

import edu.rachelpizane.formatacao.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
  static final String teste = "oi";

  @Autowired private HelloService service;

  public void issoeumatesteseometoiraseracionadopoispassardolimitedeliikjsndjnskbsahgbdskbkanhasse(
      String nome, int idade, String casa, String parede) {

    if (idade == 2) {
      return;
    }
  }
}
