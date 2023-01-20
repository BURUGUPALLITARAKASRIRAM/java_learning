package com.tarak.collstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestConsumer {
	public static void main(String[] args) {
		List<Integer> intList =new ArrayList<>();
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		//intList.stream().forEach(t -> consumer1.accept(t));
		consumerWithLambda(intList);
		//System.out.println(intList);
		//Write a function specifically and not using lambda
		
		
		intList.stream().forEach(s -> System.out.println(s));
		List<Integer> newSet=intList.stream().map(s -> function1.apply(s)).collect(Collectors.toList());
		
		System.out.println(newSet);
		
		//Write a function specifically  using lambda
		List<Integer> newSet1=intList.stream().map(s -> s*5).collect(Collectors.toList());
		
		
		System.out.println(newSet1);
		//Predicate using fiter with lambda
		List<Integer> newSet2=intList.stream().filter(s -> s%2==0).collect(Collectors.toList());
		System.out.println(newSet2);
		
		//Predicate using fiter with lmbda findFirst
		Integer newInteger=intList.stream().filter(s -> s%3==0).findFirst().get();
		System.out.println(newInteger);
	}
	
	private static void consumerWithLambda(List<Integer> intList) {
		intList.stream().forEach(s -> System.out.println(s));
	}
	
	public static void functionWithLambda(List<Integer> intList) {
		
	}
	public static Consumer<Integer> consumer1= new Consumer<Integer>() {

		@Override
		public void accept(Integer t) {
			// TODO Auto-generated method stub
			System.out.println(t);
		}
	};
	
	public static Function<Integer,Integer> function1=new Function<Integer, Integer>() {

		@Override
		public Integer apply(Integer t) {
			// TODO Auto-generated method stub
			return t*5;
		}
	};

}
