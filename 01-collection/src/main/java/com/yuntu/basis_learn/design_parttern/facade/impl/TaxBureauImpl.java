package com.yuntu.basis_learn.design_parttern.facade.impl;

import com.yuntu.basis_learn.design_parttern.facade.TaxBureau;

public class TaxBureauImpl implements TaxBureau {
	@Override
	public void taxCertificate() {
		System.out.println("税务局验资");
	}
}
