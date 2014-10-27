package com.common.Enum;

public enum Week {
	Sunday {
		@Override
		public String toString() {
			return "星期七";
		}
	},
	Monday {
		@Override
		public String toString() {

			return "星期一";
		}
	},
	Tuesday {
		@Override
		public String toString() {
			return "星期二";
		}
	},
	Wednesday {
		@Override
		public String toString() {
			return "星期三";
		}
	},
	Thursday {
		@Override
		public String toString() {
			return "星期四";
		}
	},
	Friday {
		@Override
		public String toString() {
			return "星期五";
		}
	},
	Saturday {
		@Override
		public String toString() {
			return "星期六";
		}
	};

	public abstract String toString();
}
