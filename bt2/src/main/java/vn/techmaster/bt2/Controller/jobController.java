package vn.techmaster.bt2.Controller;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.techmaster.bt2.*;
import vn.techmaster.bt2.Model.job;

import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/Job")


public class jobController {
    private ConcurrentHashMap<String, job> listJob;

    public jobController(){
        listJob = new ConcurrentHashMap<>();
        listJob.put("1", new job("1", "Tuyen Nhan vien van phong", "Di lam ngay", "Ha Noi", 5000, 7000, "abc@gmail.com"));
        listJob.put("2", new job("2", "Tuyen Quan ly", "Di lam ngay", "Hai Phong", 7000, 10000, "abc@gmail.com"));
        listJob.put("3", new job("3", "Tuyen Truong Phong", "Di lam ngay", "Da Nang", 9000, 15000, "abc@gmail.com"));
        listJob.put("4", new job("4", "Tuyen Giam doc", "Di lam ngay", "Ho Chi Minh", 20000, 30000, "abc@gmail.com"));

    }

@GetMapping
public List<job> getList(){
    return listJob.values().stream().toList();
}    

@GetMapping(value = "/{id}")
public job getJobById(@PathVariable("id") String id){
    return listJob.get(id);
}

@GetMapping(value = "/sortbylocation")
public List<job> getListByLocation() {
    return listJob.values().stream().sorted(Comparator.comparing(job::getLocation)).collect(Collectors.toList());
}

@GetMapping(value = "/salary/{salary}")
        public List<job> getJobBySalary(@PathVariable("salary") int salary) {
                return listJob.values().stream()
                                .filter(i -> (i.getMin_salary() <= (salary)) && (i.getMax_salary() >= (salary)))
                                .collect(Collectors.toList());
        }

        @GetMapping(value = "/keyword/{keyword}")
        public List<job> getListByKeyword(@PathVariable("keyword") String keyword) {
                return listJob.values().stream()
                                .filter(i -> (i.getTitle().toLowerCase().contains(keyword.toLowerCase()))
                                                || (i.getDescription().toLowerCase().contains(keyword.toLowerCase())))
                                .collect(Collectors.toList());
        }

        @GetMapping(value = "/query")
        public List<job> getListByLocationAndKeyword(@RequestParam("location") String location,
                        @RequestParam("keyword") String keyword) {
                return listJob.values().stream()
                                .filter(i -> ((i.getTitle().toLowerCase().contains(keyword.toLowerCase()))
                                                || (i.getDescription().toLowerCase().contains(keyword.toLowerCase())))
                                                && (i.getLocation().toLowerCase()
                                                                .contains(location.toLowerCase())))
                                .collect(Collectors.toList());
        }
}
