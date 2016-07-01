package com.orilore.yanxue.book;
import java.io.IOException;
import java.lang.reflect.Member;
public class MemberDemo {
	private static Object out;

	public static void main(String[] args) throws IOException {
		Member[] members = {
				new Member("B1234","Justin",90),
				new Member("B5678","Monica",95),
				new Member("B9876","Trene",88),
		};
		for(Member member : members){
			((Object) member).save();
		}
		out.println(Member.load("B1234"));
		out.println(Member.load("B5678"));
		out.println(Member.load("B9876"));
	}
}
