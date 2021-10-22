package com.example.HotelCrud.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
import com.example.HotelCrud.domain.Hotel;
import com.example.HotelCrud.service.HotelService;
 
@Controller
public class HotelController {
@Autowired
    private HotelService service;
 
    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Hotel> listhotel = service.listAll();
        model.addAttribute("listhotel", listhotel);
        System.out.print("Get / ");
        return "index";
    }
 
    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("hotel", new Hotel());
        return "new";
    }
 
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveHotel(@ModelAttribute("hotel") Hotel std) {
        service.save(std);
        return "redirect:/";
    }
 
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditHotelPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("new");
        Hotel std = service.get(id);
        mav.addObject("hotel", std);
        return mav;
        
    }
    @RequestMapping("/delete/{id}")
    public String deletehotel(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }
}