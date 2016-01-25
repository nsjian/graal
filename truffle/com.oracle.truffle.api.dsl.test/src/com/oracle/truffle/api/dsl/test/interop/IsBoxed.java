package com.oracle.truffle.api.dsl.test.interop;

import com.oracle.truffle.api.dsl.test.ExpectError;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.interop.AcceptMessage;

@AcceptMessage(value = "IS_BOXED", receiverType = ValidTruffleObject.class, language = TestTruffleLanguage.class)
public final class IsBoxed extends BaseIsBoxed {
    @SuppressWarnings({"static-method", "unused"})
    @ExpectError({"access method has to have 2 arguments"})
    public Object access(VirtualFrame frame, ValidTruffleObject object, int i) {
        return true;
    }
}
