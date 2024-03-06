package com.jobapplication.firstjobapp.review.impl;

import com.jobapplication.firstjobapp.review.Review;
import com.jobapplication.firstjobapp.review.ReviewRepository;
import com.jobapplication.firstjobapp.review.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    private ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> getAllReviews(Long companyId) {
        List<Review> reviews = reviewRepository.findByCompanyId(companyId);
        return reviews;
    }
}
