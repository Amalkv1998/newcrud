package emppack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class hellocontroller {
	@RequestMapping("/")
	public String index()
	{
		return"index";
	}
	@Autowired
	employeeDao dao;
	
	
	@RequestMapping("/add")
	public String empform(Model m)
	{
		m.addAttribute("emp", new employee());
		return "addemp";
	}
    
	@RequestMapping("/save")
	public String empsave(@ModelAttribute("emp") employee e)
	{
		dao.save(e);
		return "added";
		
		
	}
	
	@RequestMapping("/delete")
	public String empdel(@RequestParam("id") int id)
	{  
		dao.delemp(id);
		return "redirect:/view";
	}
	@RequestMapping("/edit")
	public String empedit(@RequestParam("id") int id,Model m)
	{
		List<employee>list=dao.getempbyid(id);
		employee e=list.get(0);
		m.addAttribute("emp",e);
		return "empform";
		
	}
	@RequestMapping("/editsave")
	public String editsave(@ModelAttribute("emp") employee e)
	{
		dao.editemp(e);
		return "redirect:/view";
		
		
	}
	
	@RequestMapping("/view")
	public String empview(Model m)
	{
		List<employee>list =dao.getemp();
		m.addAttribute("list",list);
		
		return "viewemp";
	}
	
	
	
}
