package gov.nara.nwts.ftapp.counter;

public enum CounterStat {
	VALID,   //Cell fonforms to rule
	WARNING, //Cell does not conform to spec, but issue occurrs so frequently it is being passed
	WARNING_CASE, //Cell has case mismatch
	WARNING_PUNCT, //Cell has trailing punct
	WARNING_TRIM, //Cell has extra whitespace
	WARNING_DATE, //Cell date is not in proper format
	INVALID_BLANK, //Non blank expected
	INVALID_SUM, //Invalid sum found
	INVALID, //Cell does not conform to rule
	JSTOR, //Common JSTOR format errors
	SHIFT_2_COL, //Common error, need to shift data table by 2 COL
	ERROR,   //Processing error interpreting rule
	UNSUPPORTED_REPORT,   //Code not yet implemented for this report type
	UNKNOWN_REPORT_TYPE,  //Report type does not match know types
	UNSUPPORTED_FILE,     //File cannot be broken into cells for processing
}
