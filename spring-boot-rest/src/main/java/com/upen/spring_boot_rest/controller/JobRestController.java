package com.upen.spring_boot_rest.controller;


import com.upen.spring_boot_rest.model.JobPost;
import com.upen.spring_boot_rest.repo.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController     // Use @RestController if you want to return JSON responses, otherwise use @Controller
public class JobRestController {

    @Autowired
    private JobService jobService;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs() {
        return jobService.getAllJobs();
    }
    @GetMapping("/jobPost/{postId}")
    public JobPost getJob(@PathVariable int postId) {
        return jobService.getJob(postId);
    }

    @GetMapping("jobPosts/keyword/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword){
        return jobService.search(keyword);

    }

    @PostMapping("jobPost")
    public void addJob(@RequestBody JobPost jobPost) {
        jobService.addJob(jobPost);
       // return jobService.getJob(jobPost.getPostId());
    }
    @PutMapping("jobPost")
    public void updateJob(@RequestBody JobPost jobPost) {
        jobService.updateJob(jobPost);

    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId) {
        jobService.deleteJob(postId);
        return "Deleted";
    }

//    @GetMapping("/load")
//    public String loadJobs() {
//        jobService.load();
//        return "success";
//    }

}
