package com.axsos.housii.housii.repositories;

import com.axsos.housii.housii.models.Rating;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends CrudRepository<Rating,Long> {
    List<Rating> findAll();
}
