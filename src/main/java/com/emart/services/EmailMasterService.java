package com.emart.services;

import com.emart.entities.EmailMaster;

public interface EmailMasterService {
    String sendSimpleMail(EmailMaster details);

    String sendMailWithAttachment(EmailMaster details);

    // New method for sending email with PDF attachment
    String sendMailWithPDFAttachment(EmailMaster details);
}
