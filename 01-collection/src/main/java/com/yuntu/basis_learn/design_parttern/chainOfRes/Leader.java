package com.yuntu.basis_learn.design_parttern.chainOfRes;

public interface Leader {
	void setNextLeader(Leader leader);
	void handleRequest(Request request,Integer sign,Leader nextLeader);
}
