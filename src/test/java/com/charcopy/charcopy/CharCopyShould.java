
package com.charcopy.charcopy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CharCopyShould {

	@Test
	void notFail() {
		// given
		ISource source = new SourceMock();
		IDestination destination = new DestinationMock();

		// when
		new Copier(source, destination);
	}

}

class SourceMock implements ISource {

	@Override
	public char getChar() {
		return 0;
	}
}

class DestinationMock implements IDestination {

	@Override
	public void setChar(char character) {

	}
}
