package com.common.Enum;

public enum Week {
	Sunday {
		@Override
		public String toString() {
			return "������";
		}
	},
	Monday {
		@Override
		public String toString() {

			return "����һ";
		}
	},
	Tuesday {
		@Override
		public String toString() {
			return "���ڶ�";
		}
	},
	Wednesday {
		@Override
		public String toString() {
			return "������";
		}
	},
	Thursday {
		@Override
		public String toString() {
			return "������";
		}
	},
	Friday {
		@Override
		public String toString() {
			return "������";
		}
	},
	Saturday {
		@Override
		public String toString() {
			return "������";
		}
	};

	public abstract String toString();
}
