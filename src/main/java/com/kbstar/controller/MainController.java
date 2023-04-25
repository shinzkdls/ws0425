package com.kbstar.controller;

import com.kbstar.dto.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class MainController {
    @RequestMapping("/")
    public String main() {
        return "index";
    }

    @RequestMapping("/charts")
    public String charts(Model model) {
        model.addAttribute("center", "charts");
        return "index";
    }

    @RequestMapping("/tables")
    public String tables(Model model) {
        model.addAttribute("center", "tables");
        return "index";
    }

    @RequestMapping("/all")
    public String all(Model model) {
        List<Item> list = new ArrayList<>();
        list.add(new Item(100, "item1", 1000, "a.jpg", new Date()));
        list.add(new Item(101, "item2", 2000, "b.jpg", new Date()));
        list.add(new Item(102, "item3", 3000, "c.jpg", new Date()));
        list.add(new Item(103, "item4", 4000, "d.jpg", new Date()));
        list.add(new Item(104, "item5", 5000, "e.jpg", new Date()));
        list.add(new Item(100, "item1", 1000, "a.jpg", new Date()));
        list.add(new Item(101, "item2", 2000, "b.jpg", new Date()));
        list.add(new Item(102, "item3", 3000, "c.jpg", new Date()));
        list.add(new Item(103, "item4", 4000, "d.jpg", new Date()));
        list.add(new Item(104, "item5", 5000, "e.jpg", new Date()));
        list.add(new Item(100, "item1", 1000, "a.jpg", new Date()));
        list.add(new Item(101, "item2", 2000, "b.jpg", new Date()));
        list.add(new Item(102, "item3", 3000, "c.jpg", new Date()));
        list.add(new Item(103, "item4", 4000, "d.jpg", new Date()));
        list.add(new Item(104, "item5", 5000, "e.jpg", new Date()));
        list.add(new Item(100, "item1", 1000, "a.jpg", new Date()));
        list.add(new Item(101, "item2", 2000, "b.jpg", new Date()));
        list.add(new Item(102, "item3", 3000, "c.jpg", new Date()));
        list.add(new Item(103, "item4", 4000, "d.jpg", new Date()));
        list.add(new Item(104, "item5", 5000, "e.jpg", new Date()));

        model.addAttribute("allitem", list);
        model.addAttribute("center", "tables");
        return "index";
    }

}
