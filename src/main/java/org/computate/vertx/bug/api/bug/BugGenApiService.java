package org.computate.vertx.bug.api.bug;

import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.api.service.ServiceResponse;
import io.vertx.ext.web.api.service.WebApiServiceGen;
import io.vertx.serviceproxy.ServiceBinder;

@WebApiServiceGen
@ProxyGen
public interface BugGenApiService {

	static void registerService(EventBus eventBus, JsonObject config, Vertx vertx) {
		new ServiceBinder(vertx).setAddress("vertx-bug-Bug").register(BugGenApiService.class, new BugGenApiServiceImpl(eventBus, config));
	}

	public void getRequest(ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
	public void patchRequest(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler);
}
