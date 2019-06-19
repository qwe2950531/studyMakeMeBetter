package com.yuntu.basis_learn.design_parttern.chainOfRes;

import lombok.Data;

@Data
public class LeaveRequest implements Request {
	private String name;
	private int leaveDays;
	private String leaveReason;

}
