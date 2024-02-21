package com.edu;

public class DistanceCalculator {

	public static void main(String[] args) {
		
		final double INITIAL_VELOCITY = 36 * 1000 / 3600; 
        final double ACCELERATION = 5; 
        double t1 = 10;
        double t2 = 8;
        for (double t : new double[]{t1, t2}) {
            double d = INITIAL_VELOCITY * t + 0.5 * ACCELERATION * t * t;
            System.out.println((int)d);
        }



	}

}
