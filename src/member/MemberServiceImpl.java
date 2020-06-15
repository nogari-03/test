package member;

public class MemberServiceImpl implements MemberService {
	private Member[] members;
	private int count;
	
	public MemberServiceImpl() {
		members = new Member[3];
		count = 0;
	}

	@Override
	public void join(Member member) {
		members[count] = member;
		count++;
		
	}

	@Override
	public void login(Member member) {
		for(int i=0;i<members.length; i++) {
			if(member.getUserid().equals(members[i].getUserid())
					&&
				member.getPassword().equals(members[i].getPassword())) {
				System.out.println("로그인 성공");
				break;
			}else {
				System.out.println("로그인 실패");
			}
		}
	}

	@Override
	public Member[] list() {
		return members;
	}

	@Override
	public String existId(Member member) {
		System.out.println("중복체크할 아이디:"+member.getUserid());
		return null;
	}

}