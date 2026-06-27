package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data161RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data162RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data163RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data164RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data165RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data166RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data167RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data168RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data169RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data170RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen017ViewModel @Inject constructor(
    private val repo1: Data161RepositoryImpl,
    private val repo2: Data162RepositoryImpl,
    private val repo3: Data163RepositoryImpl,
    private val repo4: Data164RepositoryImpl,
    private val repo5: Data165RepositoryImpl,
    private val repo6: Data166RepositoryImpl,
    private val repo7: Data167RepositoryImpl,
    private val repo8: Data168RepositoryImpl,
    private val repo9: Data169RepositoryImpl,
    private val repo10: Data170RepositoryImpl,

): ViewModel() {
}
