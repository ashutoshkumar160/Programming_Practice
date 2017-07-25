package com.ashu.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Student {
	int id;
	int score;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Student> stud = new ArrayList<Student>();
		int c = 0;
		while (c < 10) {
			String k = in.nextLine();
			StringTokenizer stk = new StringTokenizer(k, "-");
			Student st = new Student();
			st.id = Integer.parseInt(stk.nextToken());
			st.score = Integer.parseInt(stk.nextToken());
			if (c > 1) {
				Student stDup = findStudentByid(st.id, stud);
				if (stDup != null) {
					if (st.score > stDup.score) {
						stud.add(st);
						stud.remove(stDup);
					}
				} else {
					System.out.println("stDup Null" + st.id + " " + st.score);
					;
					stud.add(st);
				}
			} else
				stud.add(st);
			c++;
		}
		Collections.sort(stud, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				return o2.score - o1.score;
			}
		});
		for (Student stt : stud) {
			System.out.println(">>>>" + stt.id + "   and   " + stt.score);
		}
	}

	static Student findStudentByid(int id, ArrayList<Student> list) {
		for (Student s : list) {
			if (s.id == id)
				return s;
		}
		return null;
	}
}
