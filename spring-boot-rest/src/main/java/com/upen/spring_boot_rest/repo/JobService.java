package com.upen.spring_boot_rest.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upen.spring_boot_rest.model.JobPost;


@Service
public class JobService {

    @Autowired
    public JobRepo repo;





    //method to return all JobPosts
    public List<JobPost> getAllJobs() {
        return repo.findAll();


    }









    // method to add a jobPost
    public void addJob(JobPost jobPost) {
        repo.save(jobPost);

    }




    //method to get job by id
    public JobPost getJob(int postId) {

        return repo.findById(postId).orElse(new JobPost());
    }




    //method to update job with job post object
    public void updateJob(JobPost jobPost) {
        repo.save(jobPost);

    }




    //method to delete job post by id
    public void deleteJob(int postId) {
        repo.deleteById(postId);

    }









//    public void load() {
//        // arrayList to store store JobPost objects
//        List<JobPost> jobPosts = new ArrayList<>();
//        jobPosts.add(new JobPost(1, "Software Engineer", "Exciting opportunity for a skilled software engineer.", 3, List.of("Java", "Spring", "SQL", "API")));
//        jobPosts.add(new JobPost(2, "Data Scientist", "Join our data science team and work on cutting-edge projects.", 5, List.of("Python", "Machine Learning", "TensorFlow", "API")));
//        jobPosts.add(new JobPost(3, "Frontend Developer", "Create API amazing user interfaces with our talented frontend team.", 2, List.of("JavaScript", "React", "CSS", "API")));
//        jobPosts.add(new JobPost(4, "Network Engineer", "Design and API maintain our robust network infrastructure.", 4, List.of("Cisco", "Routing", "Firewalls")));
//        jobPosts.add(new JobPost(5, "UX Designer", "Shape the user experience with your creative design skills.", 3, List.of("UI/UX Design", "Adobe XD", "Prototyping")));
//        List<JobPost> jobs =
//                new ArrayList<>(jobPosts);
//
//        repo.saveAll(jobs);
//
//    }
//
//
//
//
//




    public List<JobPost> search(String keyword) {

        return repo.findByPostProfileContainingOrPostDescContaining(keyword,keyword);
    }




}