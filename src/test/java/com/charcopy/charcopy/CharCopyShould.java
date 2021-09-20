
package com.charcopy.charcopy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.*;

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
	void call_getChar_from_source() {
		// when
		copier.copy();

		// assert
		verify(sourceMock).getChar();
	}

	@Test
	void call_setChar_with_the_char_got() {
		//given
		char copiedChar = 'A';
		when(sourceMock.getChar()).thenReturn(copiedChar);

		//when
		copier.copy();

		//assert
		verify(destinationMock).setChar(copiedChar);
	}
}
