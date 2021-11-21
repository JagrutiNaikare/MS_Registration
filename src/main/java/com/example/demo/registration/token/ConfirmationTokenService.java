package com.example.demo.registration.token;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ConfirmationTokenService {

	private final ConfirmationTokenServiceRepository confirmationTokenServiceRepository;

	public void saveConfiramationToken(ConfirmationToken token) {
		confirmationTokenServiceRepository.save(token);
	}
	
	public Optional<ConfirmationToken> getToken(String token) {
        return confirmationTokenServiceRepository.findByToken(token);
    }

    public int setConfirmedAt(String token) {
        return confirmationTokenServiceRepository.updateConfirmedAt(
                token, LocalDateTime.now());
    }


}
