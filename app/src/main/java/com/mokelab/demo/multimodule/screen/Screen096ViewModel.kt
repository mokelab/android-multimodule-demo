package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data951RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data952RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data953RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data954RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data955RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data956RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data957RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data958RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data959RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data960RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen096ViewModel @Inject constructor(
    private val repo1: Data951RepositoryImpl,
    private val repo2: Data952RepositoryImpl,
    private val repo3: Data953RepositoryImpl,
    private val repo4: Data954RepositoryImpl,
    private val repo5: Data955RepositoryImpl,
    private val repo6: Data956RepositoryImpl,
    private val repo7: Data957RepositoryImpl,
    private val repo8: Data958RepositoryImpl,
    private val repo9: Data959RepositoryImpl,
    private val repo10: Data960RepositoryImpl,

): ViewModel() {
}
