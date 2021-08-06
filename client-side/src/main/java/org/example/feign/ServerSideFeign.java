package org.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="serverSideFeign",url="https://server-side.com:9443")
public interface ServerSideFeign {

	@GetMapping(value = "/hello/server/side")
	String hello();
}
