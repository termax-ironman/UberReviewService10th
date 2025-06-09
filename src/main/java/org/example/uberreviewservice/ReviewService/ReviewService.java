package org.example.uberreviewservice.ReviewService;

import lombok.extern.slf4j.Slf4j;
import org.example.uberreviewservice.Repository.BookingRepository; // Correct import
import org.example.uberreviewservice.Repository.DriverRepository;
import org.example.uberreviewservice.Repository.ReviewRepository;
import org.example.uberreviewservice.models.Booking;
import org.example.uberreviewservice.models.CustomDriver;
import org.example.uberreviewservice.models.Driver;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ReviewService implements CommandLineRunner {

    private final BookingRepository bookingRepository;
    private ReviewRepository reviewRepository;
    private DriverRepository driverRepository;

    public ReviewService(ReviewRepository reviewRepository, BookingRepository bookingRepository, DriverRepository driverRepository) {
        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
        this.driverRepository = driverRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.print("*******************************");
//        Review r = Review
//                .builder()
//                .content("gulu gulu ride")
//                .rating(77.8)
//                .build();
//        Booking b  = Booking.builder().endTime(new Date()).driverReview(r).build();
//
//        System.out.println(r);
//       // reviewRepository.save(r); //this code executes sql query
//        bookingRepository.save(b);
//        log.info(r.getId().toString());
//        List<Review> reviews = reviewRepository.findAll();
//        for(Review review : reviews) {
//            log.info(review.getContent());
//        }
//        reviewRepository.deleteById(4L);
//        Optional<Booking> b = bookingRepository.findById(4L);
//        if(b.isPresent()) {
//            bookingRepository.delete(b.get());
//        }
//        Optional<Driver> driver = driverRepository.findById(2L);
//        if(driver.isPresent()) {
//            log.info(driver.get().getName());
//            List<Booking> list = driver.get().getBookingList();
////            List<Booking> bookings = bookingRepository.findAllByDriverId(1L);
//            for(Booking booking : list) {
//                System.out.println(booking.getId());
//            }
//        }
  //      Optional<Booking> b = bookingRepository.findById(1L);
        Optional<CustomDriver> d = driverRepository.hqlFindByIdAndLicence(1L,"DL 1221");
        System.out.println(d.get().getName());
    }
}
