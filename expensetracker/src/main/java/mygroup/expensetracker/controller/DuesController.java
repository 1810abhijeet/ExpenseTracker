package mygroup.expensetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mygroup.expensetracker.model.Dues;
import mygroup.expensetracker.service.DuesService;

@Controller
public class DuesController {
	
	@Autowired
	private DuesService duesService;
	
	@RequestMapping("/")
	public String viewHome(Model model) {
		List<Dues> duesList = duesService.listAllByStartDate();
		model.addAttribute("duesList", duesList);
		return "index";
	}
	
	@RequestMapping("/duedate")
	public String viewHomeByDueDate(Model model) {
		List<Dues> duesList = duesService.listAllByDueDate();
		model.addAttribute("duesList", duesList);
		return "index";
	}
	
	@RequestMapping("/new")
	public String showNewDue(Model model) {
		Dues due = new Dues();
		model.addAttribute("due", due);
		return "new_due";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveDue(@ModelAttribute("due") Dues due) {
	duesService.save(due);
	return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditDue(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_due");
		Dues due1 = duesService.get(id);
		mav.addObject("due1", due1);
		return mav;
	}
	
	@RequestMapping(value = "/delete/{id}")
	public String deleteDue(@PathVariable(name = "id") int id) {
		duesService.delete(id);
		return "redirect:/";
	}

}
