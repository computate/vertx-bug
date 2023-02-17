package org.computate.vertx.bug.api.bug;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.api.service.ServiceRequest;
import io.vertx.ext.web.api.service.ServiceResponse;

public class BugGenApiServiceImpl implements BugGenApiService {
	protected static final Logger LOG = LoggerFactory.getLogger(BugGenApiServiceImpl.class);

	protected EventBus eventBus;

	protected JsonObject config;

	public BugGenApiServiceImpl(EventBus eventBus, JsonObject config) {
		this.eventBus = eventBus;
		this.config = config;
	}

	// Search //

	@Override
	public void getRequest(ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler) {
		eventHandler.handle(Future.succeededFuture(ServiceResponse.completedWithJson(Buffer.buffer(new JsonObject().put("success", true).encodePrettily()))));
	}

	@Override
	public void patchRequest(JsonObject body, ServiceRequest serviceRequest, Handler<AsyncResult<ServiceResponse>> eventHandler) {
		eventHandler.handle(Future.succeededFuture(ServiceResponse.completedWithJson(Buffer.buffer(new JsonObject().put("success", true).encodePrettily()))));
	}
}
