package com.mum.cs.mpp.lab;

import java.util.Date;
import java.util.List;

public class Sprint {
	private long id;
	private long releaseId;
	private String name;
	private List<Feature> featureList;
	double progressRate = 0.0;
	Date dueDate;
}
