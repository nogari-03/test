package member;

public class MemberServiceImpl implements MemberService {
	private Member[] members;
	private int idx;
	
	public MemberServiceImpl() {
		members = new Member[3];
		idx = 0;
	}

	@Override
	public void join(Member member) {
		System.out.println("App���� �Ѿ�� ȸ������");
		System.out.println(member.toString());
		members[idx] = member;
		System.out.println("�迭�� ����� ȸ����ȣ");
		System.out.println(members[idx]);
		
	}

	@Override
	public void login() {
		
	}

}