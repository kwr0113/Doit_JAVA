package day11.collection;

import java.util.Comparator;

public class Member2 implements Comparator<Member> {
	private int memberId;
	private String memberName;
	
	public Member2(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + " ȸ������ ID�� " + memberId + " �Դϴ�";
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member = (Member2)obj;
			if(this.memberId == member.memberId)
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public int compare(Member o1, Member o2) {
		return o1.getMemberId() - o2.getMemberId();
	}
	
	
	
	
}
