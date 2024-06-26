package ru.yandex.practicum.filmorate.service;

import ru.yandex.practicum.filmorate.model.Review;

import java.util.Collection;

public interface ReviewService {
    Review createReview(Review review);

    Review updateReview(Review review);

    Review deleteReview(Long id);

    Review getReviewById(Long id);

    Collection<Review> getReviewByFilmId(Long filmId, int count);

    Collection<Review> getAllReviews(int count);

    Review postLike(Long id, Long userId);

    Review postDislike(Long id, Long userId);

    Review deleteLike(Long id, Long userId);

    Review deleteDislike(Long id, Long userId);
}
