
package com.charcopy.charcopy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@SpringBootTest
class CharCopyShould {

		ISource sourceMock;
		IDestination destinationMock;
		Copier copier;

	@BeforeEach
	void set() {
		sourceMock = mock(ISource.class);
		destinationMock = mock(IDestination.class);
		copier = new Copier(sourceMock, destinationMock);
	}

	@Test
	void call_get_char_from_source() {
		// when
		copier.copy();

		// assert
		verify(sourceMock).getChar();
	}
}
