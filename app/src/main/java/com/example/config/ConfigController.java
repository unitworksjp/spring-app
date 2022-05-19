package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConfigController {

	@Autowired
	Config conf;

	@Autowired
	User user;

	@Value("${spring-app.hoge}")
	private String hoge;

	@Value("${spring-app.fuga}")
	private String fuga;

	// これは環境変数（MYSQL_DATABASE）から設定
	@Value("${mysql.database}")
	private String db;

	@GetMapping("/config")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", this.conf.getName());
		model.addAttribute("description", this.conf.getDescription());
		model.addAttribute("version", this.conf.getVersion());
		model.addAttribute("user", this.user);
		model.addAttribute("hoge", this.hoge);
		model.addAttribute("fuga", this.fuga);
		model.addAttribute("db", this.db);
		return "config";
	}
}
