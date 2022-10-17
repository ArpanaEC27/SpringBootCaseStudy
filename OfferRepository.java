package com.gl.springBootCaseStudy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.springBootCaseStudy.bean.Offer;



public interface OfferRepository extends JpaRepository<Offer, Long> {

}
