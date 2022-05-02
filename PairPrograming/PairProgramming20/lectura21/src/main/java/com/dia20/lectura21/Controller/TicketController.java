package com.dia20.lectura21.Controller;

import com.dia20.lectura21.Model.Ticket;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/ticket")
public class TicketController {

    @GetMapping()
    public String getTicket(RedirectAttributes atributes)
    {
        return "Ticket";
    }

    @GetMapping("/create/{id}")
    public String generar(@PathVariable("id") int id, RedirectAttributes atributes, Model model){
        Ticket ticket = new Ticket();
        ticket.setAutoId(id);
        atributes.addFlashAttribute( "ticket", ticket);
        return "redirect:/ticket";
    }




}
