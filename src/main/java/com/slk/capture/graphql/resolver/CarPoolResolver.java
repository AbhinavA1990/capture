package com.slk.capture.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.slk.capture.model.CarPool;

public class CarPoolResolver implements GraphQLResolver<CarPool> {
	public Long getGraphId(CarPool carpool) {
		return carpool.getGraphId();
}
}
