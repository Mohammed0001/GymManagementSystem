/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mms.gymmanagementserver;

/**
 *
 * @author hp
 */
public interface MemberSesAssembler {
    MemberSessionDTO assembleDTO(Member member, Session session);

    boolean assembleDomainObjects(MemberSessionDTO dto);
}
