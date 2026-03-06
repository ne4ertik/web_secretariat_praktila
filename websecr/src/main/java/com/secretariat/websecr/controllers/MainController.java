package com.secretariat.websecr.controllers;
import com.secretariat.websecr.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {

    private final NonresidentService nonresidentService;
    private final OrganizationService organizationService;

    private final DepartmentService departmentService;
    private final ReceptionService receptionService;

    private final CityCodesService cityCodesService;

    // Правильный конструктор
    public MainController(NonresidentService nonresidentService, OrganizationService organizationService1, DepartmentService departmentService, ReceptionService receptionService, CityCodesService cityCodesService) {
        this.nonresidentService = nonresidentService;

        this.organizationService = organizationService1;

        this.departmentService = departmentService;

        this.receptionService = receptionService;

        this.cityCodesService = cityCodesService;

    }

    @GetMapping("/")
    public String home(Model model) {
        List<Nonresident> residents = nonresidentService.findAll();
        model.addAttribute("residents", residents);
        return "home"; }

    @GetMapping("/organizations")
    public String organization(Model model) {
        List<Organization> organizations = organizationService.findAll();
        model.addAttribute("organizations", organizations);;
        model.addAttribute("title", "Организации");
        return "organizations";
    }

    @GetMapping("/departaments")
    public String departaments(Model model) {
        List<Departament> departments = departmentService.findAll(); // получаем список отделов
        model.addAttribute("departments", departments);
        model.addAttribute("title", "Отделы");
        return "departments";
    }

    @GetMapping("/receptions")
    public String receptions(Model model) {
        List<reception> receptions = receptionService.findAll(); // получаем список
        model.addAttribute("receptions", receptions);
        model.addAttribute("title", "Ресепшены");
        return "receptions";
    }

    @GetMapping("/cities")
    public String cities(Model model) {
        List<City_codes> cityCodes = cityCodesService.findAll(); // получаем список
        model.addAttribute("cityCodes", cityCodes);
        model.addAttribute("title", "Коды городов");
        return "citycodes";
    }



}
