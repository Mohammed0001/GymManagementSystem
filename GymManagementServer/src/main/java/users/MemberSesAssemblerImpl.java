/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users;

import users.Member;

/**
 *
 * @author hp
 */
public class MemberSesAssemblerImpl implements MemberSesAssembler {

    @Override
    public MemberSessionDTO assembleDTO(Member member, Session session) {
        return new MemberSessionDTO(
                member.getMemberId(),
                member.getName(),
                member.getEmail(),
                member.getSubscriptionType(),
                member.getProgressLevel(),
                session.getSessionId(),
                session.getSessionTime(),
                session.getTrainerName(),
                session.getClassName(),
                session.getSessionStatus(),
                session.getEnrolledMembersCount()
        );
    }

    @Override
    public boolean assembleDomainObjects(MemberSessionDTO dto) {
        // Convert DTO back to domain objects and update the system
        Member member = new Member(dto.getMemberId(), dto.getMemberName(), dto.getEmail(), dto.getSubscriptionType(), dto.getProgressLevel());
        Session session = new Session(dto.getSessionId(), dto.getSessionTime(), dto.getTrainerName(), dto.getClassName(), dto.getSessionStatus(), dto.getEnrolledMembersCount());

        // Simulate saving to the database
        Database database = Database.getInstance();
        database.updateMember(member);
        database.updateSession(session);

        return true;
    }
}
