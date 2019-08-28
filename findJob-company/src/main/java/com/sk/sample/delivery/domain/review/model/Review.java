package com.sk.sample.delivery.domain.review.model;

import javax.persistence.Entity;

import com.sk.sample.delivery.domain.base.AbstractEntity;
import com.sk.sample.delivery.domain.base.AggregateRoot;

import lombok.Data;

@Data
@Entity
public class Review extends AbstractEntity implements AggregateRoot {
	private Long accountId;
	private Long restaurantId;
	
	private String content;
	private Integer starCount;
	

}
