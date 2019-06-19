package com.yuntu.basis_learn.design_parttern.chainOfRes;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class LeaderImpl  {
	private List<Request> list = new ArrayList<>();
	private Leader nextLeader;
	private String name;
	public void setNextLeader(Leader leader) {
		nextLeader=leader;
	}

	public void handleRequest(Request request,Integer sign,LeaderImpl nextLeader) {
		if(request instanceof LeaveRequest){
			LeaveRequest leader = (LeaveRequest)request;
			if(sign==1){
				System.out.println("批准！");
			} else {
				nextLeader.getList().add(request);
			}
		}
	}
}
