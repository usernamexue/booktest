package com.orilore.yanxue.book;
import static java.lang.System.out;

import java.lang.reflect.Member;
public class Member2Demo {
	public static void main(String[] args) throws Exception {
		Member2 [] members = {(Member2) new Member("B1234","Justin",90),
							 (Member2) new Member("B5678","Monica",95),
		                     (Member2) new Member("B9876","Irene",88)	};
		for(Member2 member : members){
			member.save();
		}
		out.println(Member2.load("B1234"));
		out.println(Member2.load("B5678"));
		out.println(Member2.load("B9876"));
	}
}
