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
		System.out.println("App에서 넘어온 회원정보");
		System.out.println(member.toString());
		members[idx] = member;
		System.out.println("배열에 저장된 회원번호");
		System.out.println(members[idx]);
		
	}

	@Override
	public void login() {
		
	}

}